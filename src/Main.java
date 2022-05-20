public class Main{

    public static void main(String[] args)  {
        Gryffindor [] gryffindors = {
                new Gryffindor("Garry", "Potter", 98, 90, 100, 99, 95),
                new Gryffindor("Germiona", "Greyndger", 89, 76, 81, 65, 67),
                new Gryffindor("Ron", "Yisli", 45, 43, 78, 56, 79),
        };
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getFirstName() + "; Фамилия " + gryffindor.getLastName() + "; Сила магии " + gryffindor.getWitchkraft() + "; Трансгрессия " + gryffindor.getTransgress() + "; Благородство " + gryffindor.getNobility() + "; Честь " + gryffindor.getHonour() + "; Храбрость " + gryffindor.getBravery());
        }
        Kogtevran [] kogtevrans = {
                new Kogtevran("Chzoy", "Chang", 56, 76, 87, 34, 45, 12),
                new Kogtevran("Padma", "Patil", 56, 78, 65, 34, 67, 34),
                new Kogtevran("Marcus", "Belbi", 45, 34, 87, 34, 56, 65),
        };
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя " + kogtevran.getFirstName() + "; Фамилия " + kogtevran.getLastName() + "; Сила магии " + kogtevran.getWitchkraft() + "; Трансгрессия " + kogtevran.getTransgress() + "; Ум " + kogtevran.getMind() + "; Мудрость " + kogtevran.getWisdom() + "; Остроумие " + kogtevran.getWit() + "; Творчество " + kogtevran.getCreative());
        }
        Puffendy [] puffendies = {
                new Puffendy("Zaharya", "Smith", 34, 56, 76, 45, 76),
                new Puffendy("Sedrick", "Diggory", 97, 76, 56, 34, 56),
                new Puffendy("Dgastin", "Phinch-Phlechly", 45, 65, 78, 24, 45),
        };
        for (int i = 0; i < puffendies.length; i++) {
            Puffendy puffendy = puffendies[i];
            System.out.println("Имя " + puffendy.getFirstName() + "; Фамилия " + puffendy.getLastName() + "; Сила магии " + puffendy.getWitchkraft() + "; Трансгрессия " + puffendy.getTransgress() + "; Трудолюбие " + puffendy.getIndustriousness() + "; Верность " + puffendy.getLoyalty() + "; Честность " + puffendy.getHonour());
        }
        Slytherin [] slytherins = {
                new Slytherin("Drako", "Malphoy", 55, 66, 76, 34, 56, 98, 100),
                new Slytherin("Grehem", "Montegy", 33, 44, 55, 66, 67, 56, 34),
                new Slytherin("Gregory", "Goyl", 44, 55, 66, 77, 88, 22, 12),
        };
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getFirstName() + "; Фамилия " + slytherin.getLastName() + "; Сила магии " + slytherin.getWitchkraft() + "; Трансгрессия " + slytherin.getTransgress() + "; Хитрость " + slytherin.getCunning() + "; Решительность " + slytherin.getDetermination() + "; Амбициозность " + slytherin.getAmbition() + "; Находчивость " + slytherin.getResourcefulness() + "; Жажда власти " + slytherin.getLustForPower());
        }

    }
}