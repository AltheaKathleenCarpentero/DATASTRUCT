public class MainSandwich {
    public static void main(String[] args) {
    
        Sandwich x = new Sandwich();
        
        x.setMainIng("Tuna");
        x.setBrdType("Wheat");
        x.setPrc(15);
        
        System.out.println("Main Ingredient: " + x.getMainIng());
        System.out.println("Bread Type: " + x.getBrdType());
        System.out.println("Price: $" + x.getPrc());
    }
}

class Sandwich {
    private String mainIng;
    private String brdType;
    private int prc;

       public String getMainIng() {
        return mainIng;
    }

    public void setMainIng(String mainIng) {
        this.mainIng = mainIng;
    }

      public String getBrdType() {
        return brdType;
    }

    public void setBrdType(String brdType) {
        this.brdType = brdType;
    }

    public int getPrc() {
        return prc;
    }

    public void setPrc(int prc) {
        this.prc = prc;
    }
}
