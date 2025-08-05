package poo.exercises.exercise1;

public class Account {

    private float balance;

    private final float limitSpecialCheck;

    private float usedValueSpecialCheck;

    private boolean isUsingSpecialCheck;

    public Account(float initialDeposit) {
        this.balance = initialDeposit;
        if (initialDeposit <= 500f) {
            limitSpecialCheck = 50f;
        } else {
            limitSpecialCheck = initialDeposit * 0.5f;
        }
        this.usedValueSpecialCheck = 0.0f;
        this.isUsingSpecialCheck = false;
    }
    //Getters
    public float getLimitSpecialCheck(){ //Get Limite do cheque especial
        return limitSpecialCheck;
    }
    public float getBalance() { //Get saldo da conta
        return balance;
    }
    public float getUsedValueSpecialCheck() { //
        return usedValueSpecialCheck;
    }
    public boolean isUsingSpecialCheck() {
        return isUsingSpecialCheck;
    }
    //Setters
    public void setBalance(float balance) { // Set saldo da conta
        this.balance = balance;
    }
    public void setUsedValueSpecialCheck(float usedValueSpecialCheck) {
        this.usedValueSpecialCheck = usedValueSpecialCheck;
    }

    public void setUsingSpecialCheck(boolean usingSpecialCheck) {
        isUsingSpecialCheck = usingSpecialCheck;
    }

    //Funções
    public void deposit(float amount){
        if(amount <= 0){
            System.out.println("Valor inválido!");
            return;
        }
        if(this.isUsingSpecialCheck){
            float totalDebt = this.usedValueSpecialCheck * 1.20f;
            if (amount >= totalDebt){
                this.balance += (amount - totalDebt);
                this.usedValueSpecialCheck = 0.0f;
                this.isUsingSpecialCheck = false;
                System.out.printf("A dívida de %s foi abatida. Seu novo saldo é de %s \n", totalDebt,this.balance);
            }else{ //Caso o valor de depósito for menor que a dívida total
                this.usedValueSpecialCheck -= amount;
                totalDebt = this.usedValueSpecialCheck * 1.20f;
                System.out.printf("Foi abatido R$%s da dívida, dívida restante(com taxa) R$%s \n", amount, totalDebt);
            }
        }else{
            this.balance += amount;
            System.out.printf("O valor de R$%s foi depositado na conta \n", amount);
        }
    }
    public boolean withdraw(float amount) {
        if (amount <= 0) {
            System.out.println("Valor de saque inválido");
            return false;
        }
        float availableForWithdraw = this.balance + this.limitSpecialCheck;
        if (amount > availableForWithdraw) {
            System.out.println("Valor de saque inválido mesmo com cheque especial");
            return false;
        }
        if (amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("Saque no valor de R$%s realizado com o saldo da conta. Saldo atual = R$%s ", amount, this.balance);
        } else {
            float amountFromBalance = this.balance;
            float amountFromSpecialCheck = amount - amountFromBalance;
            this.balance = 0.0f;
            this.usedValueSpecialCheck += amountFromSpecialCheck;
            this.isUsingSpecialCheck = true;
            System.out.printf("Foi realizado o saque no valor de R$%s utilizando o cheque especial, valor do cheque especial atual (Sem a taxa de 20%): R$%s ", amount, this.usedValueSpecialCheck);
        }
        return true;
    }
    public boolean payBill(float amount){
        if (amount <= 0) {
            System.out.println("Valor do boleto inválido");
            return false;
        }
        return withdraw(amount);
    }
    public String getSpecialCheckStatus(){
        if (isUsingSpecialCheck){
            var totalDebtWithTax = getUsedValueSpecialCheck() * 1.20f;
            return String.format("Você está utilizando o cheque especial e sua dívida total(com taxa) é de R$%s", totalDebtWithTax) ;
        }else{
            return "Você não está utilizando o cheque especial";
        }
    }
    }


