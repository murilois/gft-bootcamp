package poo.exercises.exercise2;

public class PetMachine {
    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;


    public void takeAShower(){
        if(this.pet == null){
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        }
        this.water -= 10;
        this.shampoo -=2;

        pet.setClean(true);
        System.out.printf("O pet %s está limpo \n", pet.getName());
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if(shampoo == 10){
            System.out.println("A capacidade de shampoo da máquina está no máximo");
            return;
        }
        shampoo += 2;
    }

    public int getShampoo() {
        return shampoo;
    }

    public int getWater() {
        return water;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A máquina está suja, para colocar o pet é necessária limpa-la");
            return;
        }
        if(hasPet()){
            System.out.printf("O pet %s está na máquina neste momento \n", this.pet.getName());
            return;
        }
        this.pet = pet;
        System.out.printf("O pet %s foi colocado na máquina \n", pet.getName());
    }
    public void removePet(){
        this.clean = this.pet.getClean();
        System.out.printf("O pet %s foi retirado da máquina \n", this.pet.getName());
        this.pet = null;
    }
    public void wash(){
        this.water -= 10;
        this.shampoo -=2;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }
}
