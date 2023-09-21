class Computer {
    public void playMusic(){
        System.out.println("Playing music...");
    }
    public String getMePen(int cost){
        if (cost > 10) {
            return "pen";
        }
        return "nothing";
    }
}



class Methods {
    public static void main(String args[]){
        Computer obj_comp = new Computer();
        obj_comp.playMusic();
        String str = obj_comp.getMePen(12);
        System.out.println(str);
    }
    
}
