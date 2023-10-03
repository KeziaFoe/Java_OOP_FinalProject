package com.mycompany.restoranadminuser;
import java.util.*;

class Login{
    private String username;
    private String password;
    
    public Login(){
        username = "Management1";
        password = "Resto2";
    }
    
    public String getusername(){
        return this.username;
    }
    
    public String getpassword(){
        return this.password;
    }
    
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class Pemesanan{
    public int hrPemesanan;
    public int jumPemesanan;
    public String nmPemesanan;
    public Pemesanan(String nmPemesanan, int jumPemesanan, int hrPemesanan){
        this.hrPemesanan = hrPemesanan;
        this.nmPemesanan = nmPemesanan;
        this.jumPemesanan = jumPemesanan;
    }
}

class Pembuka{
    public int kdPembuka;
    public int hrPembuka;
    public String nmPembuka;
    public Pembuka(int kdPembuka, String nmPembuka, int hrPembuka){
        this.kdPembuka = kdPembuka;
        this.hrPembuka = hrPembuka;
        this.nmPembuka = nmPembuka;
    }
}

class Utama{
    public int kdUtama;
    public int hrUtama;
    public String nmUtama;
    public Utama(int kdUtama, String nmUtama, int hrUtama){
        this.kdUtama = kdUtama;
        this.hrUtama = hrUtama;
        this.nmUtama = nmUtama;
    }
}

class Penutup{
    public int kdPenutup;
    public int hrPenutup;
    public String nmPenutup;
    public Penutup(int kdPenutup, String nmPenutup, int hrPenutup){
        this.kdPenutup = kdPenutup;
        this.hrPenutup = hrPenutup;
        this.nmPenutup = nmPenutup;
    }
}

class MinumPanas{
    public int kdMinumPanas;
    public int hrMinumPanas;
    public String nmMinumPanas;
    public MinumPanas(int kdMinumPanas, String nmMinumPanas, int hrMinumPanas){
        this.kdMinumPanas = kdMinumPanas;
        this.hrMinumPanas = hrMinumPanas;
        this.nmMinumPanas = nmMinumPanas;
    }
}

class MinumDingin{
    public int kdMinumDingin;
    public int hrMinumDingin;
    public String nmMinumDingin;
    public MinumDingin(int kdMinumDingin, String nmMinumDingin, int hrMinumDingin){
        this.kdMinumDingin = kdMinumDingin;
        this.hrMinumDingin = hrMinumDingin;
        this.nmMinumDingin = nmMinumDingin;
    }
}

class Editmenu{
    public static ArrayList<Pembuka> makananpembuka = new ArrayList<Pembuka>();
    public static ArrayList<Utama> makananutama = new ArrayList<Utama>();
    public static ArrayList<Penutup> makananpenutup = new ArrayList<Penutup>();
    public static ArrayList<MinumPanas> minumanpanas = new ArrayList<MinumPanas>();
    public static ArrayList<MinumDingin> minumandingin = new ArrayList<MinumDingin>();
    public static void printPembuka(){
        System.out.println("APPETIZER");
        int i=1;
        for(Pembuka all : makananpembuka){
            System.out.println(i + ". <" + all.kdPembuka + ">-<" + all.nmPembuka + ">-<" + all.hrPembuka + ">");
            i++;
        }
        System.out.println(" ");
    }
    
    public static void printUtama(){
        System.out.println("MAIN COURSE");
        int j=1;
        for(Utama all : makananutama){
            System.out.println(j + ". <" + all.kdUtama + ">-<" + all.nmUtama + ">-<" + all.hrUtama + ">");
            j++;
        }
        System.out.println(" ");
    }
    
    public static void printPenutup(){
        System.out.println("DESSERT");
        int k=1;
        for(Penutup all : makananpenutup){
            System.out.println(k + ". <" + all.kdPenutup + ">-<" + all.nmPenutup + ">-<" + all.hrPenutup + ">");
            k++;
        }
        System.out.println(" ");
    }
    
    public static void printPanas(){
         System.out.println("HOT BAVERAGE");
        int l=1;
        for(MinumPanas all : minumanpanas){
            System.out.println(l + ". <" + all.kdMinumPanas + ">-<" + all.nmMinumPanas + ">-<" + all.hrMinumPanas + ">");
            l++;
        }
        System.out.println(" ");
    }
    
    public static void printDingin(){
        System.out.println("COLD BAVERAGE");
        int m = 1;
        for(MinumDingin all : minumandingin){
            System.out.println(m + ". <" + all.kdMinumDingin + ">-<" + all.nmMinumDingin + ">-<" + all.hrMinumDingin + ">");
            m++;
        }
        System.out.println(" ");
    }

    public static void printmenu(){
        System.out.println("======Registered Menu=====");
        System.out.println(" ");
        printPembuka();
        System.out.println(" ");
        printUtama();
        System.out.println(" ");
        printPenutup();
        System.out.println(" ");
        printPanas();
        System.out.println(" ");
        printDingin();
        System.out.println(" ");
    }
   
    public static void edit(){
        int action;
        int kodeBaru, hargaBaru;
        String namaBaru;
        Scanner inputAngka = new Scanner(System.in);
        Scanner inputString = new Scanner(System.in);
        do{
            System.out.println("Please choose your action : ");
            System.out.println("1. Add a new menu");
            System.out.println("2. Delete a menu");
            System.out.println("3. Update a menu");
            System.out.println("0. Exit");
            System.out.print("Your choice : ");
            action = inputAngka.nextInt();
            System.out.println(" ");
            switch(action){
                case 1 ->  {
                    int kategori;
                    do{
                        System.out.println("Choose menu category : ");
                        System.out.println("1. Appetizer");
                        System.out.println("2. Main Course");
                        System.out.println("3. Dessert");
                        System.out.println("4. Hot Beverage");
                        System.out.println("5. Cold Beverage");
                        System.out.println("0. Exit");
                        System.out.print("Your choice : ");
                        kategori = inputAngka.nextInt();
                        System.out.println(" ");
                        switch (kategori) {
                            case 1 -> {
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                makananpembuka.add(new Pembuka(kodeBaru, namaBaru, hargaBaru));
                                printmenu();
                                break;
                            }
                            case 2 -> {
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                makananutama.add(new Utama(kodeBaru, namaBaru, hargaBaru));
                                printmenu();
                                break;
                            }
                            case 3 -> {
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                makananpenutup.add(new Penutup(kodeBaru, namaBaru, hargaBaru));
                                printmenu();
                                break;
                            }
                            case 4 -> {
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                minumanpanas.add(new MinumPanas(kodeBaru, namaBaru, hargaBaru));
                                printmenu();
                                break;
                            }
                            case 5 -> {
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                minumandingin.add(new MinumDingin(kodeBaru, namaBaru, hargaBaru));
                                printmenu();
                                break;
                            }
                            case 0 -> {
                                System.out.println("Back to choose action");
                                System.out.println(" ");
                                break;
                            }
                            default -> {
                                System.out.println("Please choose your category correctly");
                                System.out.println(" ");
                                break;
                            }
                        }
                    }while(kategori!=0);
                    break;
                }
                case 2 ->  {
                    int kategori;
                    do{
                        System.out.println("Choose menu category : ");
                        System.out.println("1. Appetizer");
                        System.out.println("2. Main Course");
                        System.out.println("3. Dessert");
                        System.out.println("4. Hot Beverage");
                        System.out.println("5. Cold Beverage");
                        System.out.println("0. Exit");
                        System.out.print("Your choice : ");
                        kategori = inputAngka.nextInt();
                        System.out.println(" ");
                        switch (kategori) {
                            case 1 -> {
                                System.out.println("Before Deleting ");
                                printPembuka();
                                System.out.print("Menu number : ");
                                kodeBaru = inputAngka.nextInt();
                                int i;
                                for(i=0; i<makananpembuka.size(); i++){
                                    if(i == kodeBaru-1){
                                        makananpembuka.remove(i);
                                    }
                                }
                                System.out.println("After Deleting ");
                                printmenu();
                                break;
                            }
                            case 2 -> {
                                System.out.println("Before Deleting ");
                                printUtama();
                                System.out.print("Menu number : ");
                                kodeBaru = inputAngka.nextInt();
                                int i;
                                for(i=0; i<makananutama.size(); i++){
                                    if(i == kodeBaru-1){
                                        makananutama.remove(i);
                                    }
                                }
                                System.out.println("After Deleting ");
                                printmenu();
                                break;
                            }
                            case 3 -> {
                                System.out.println("Before Deleting ");
                                printPenutup();
                                System.out.print("Menu number : ");
                                kodeBaru = inputAngka.nextInt();
                                int i;
                                for(i=0; i<makananpenutup.size(); i++){
                                    if(i == kodeBaru-1){
                                        makananpenutup.remove(i);
                                    }
                                }
                                System.out.println("After Deleting ");
                                printmenu();
                                break;
                            }
                            case 4 -> {
                                System.out.println("Before Deleting ");
                                printPanas();
                                System.out.print("Menu number : ");
                                kodeBaru = inputAngka.nextInt();
                                int i;
                                for(i=0; i<minumanpanas.size(); i++){
                                    if(i == kodeBaru-1){
                                        minumanpanas.remove(i);
                                    }
                                }
                                System.out.println("After Deleting ");
                                printmenu();
                                break;
                            }
                            case 5 -> {
                                System.out.println("Before Deleting ");
                                printDingin();
                                System.out.print("Menu number : ");
                                kodeBaru = inputAngka.nextInt();
                                int i;
                                for(i=0; i<minumandingin.size(); i++){
                                    if(i == kodeBaru-1){
                                        minumandingin.remove(i);
                                    }
                                }
                                System.out.println("After Deleting ");
                                printmenu();
                                break;
                            }
                            case 0 -> {
                                System.out.println("Back to choose action");
                                break;
                            }
                            default -> {
                                System.out.println("Please choose your action correctly");
                                break;
                            }
                        }
                    }while(kategori!=0);
                    break;
                }
                case 3 ->  {
                    int kategori;
                    do{
                        System.out.println("Choose menu category : ");
                        System.out.println("1. Appetizer");
                        System.out.println("2. Main Course");
                        System.out.println("3. Dessert");
                        System.out.println("4. Hot Beverage");
                        System.out.println("5. Cold Beverage");
                        System.out.println("0. Exit");
                        System.out.print("Your choice : ");
                        kategori = inputAngka.nextInt();
                        System.out.println(" ");
                        switch (kategori) {
                            case 1 -> {
                                System.out.println("Before Updating ");
                                printPembuka();
                                System.out.print("Menu number : ");
                                int kode = inputAngka.nextInt();
                                kode = kode-1;
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                Pembuka baru = new Pembuka(kodeBaru,namaBaru,hargaBaru);
                                makananpembuka.set(kode, baru);
                                System.out.println("After Updating ");
                                printmenu();
                                break;
                            }
                            case 2 -> {
                                System.out.println("Before Updating ");
                                printUtama();
                                System.out.print("Menu number : ");
                                int kode = inputAngka.nextInt();
                                kode = kode-1;
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                Utama baru = new Utama(kodeBaru,namaBaru,hargaBaru);
                                makananutama.set(kode, baru);
                                System.out.println("After Updating ");
                                printmenu();
                                break;
                            }
                            case 3 -> {
                                System.out.println("Before Updating ");
                                printPenutup();
                                System.out.print("Menu number : ");
                                int kode = inputAngka.nextInt();
                                kode = kode-1;
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                Penutup baru = new Penutup(kodeBaru,namaBaru,hargaBaru);
                                makananpenutup.set(kode, baru);
                                System.out.println("After Updating ");
                                printmenu();
                                break;
                            }
                            case 4 -> {
                                System.out.println("Before Updating ");
                                printPanas();
                                System.out.print("Menu number : ");
                                int kode = inputAngka.nextInt();
                                kode = kode-1;
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                MinumPanas baru = new MinumPanas(kodeBaru,namaBaru,hargaBaru);
                                minumanpanas.set(kode, baru);
                                System.out.println("After Updating ");
                                printmenu();
                                break;
                            }
                            case 5 -> {
                                System.out.println("Before Updating ");
                                printDingin();
                                System.out.print("Menu number : ");
                                int kode = inputAngka.nextInt();
                                kode = kode-1;
                                System.out.print("New Code Menu : ");
                                kodeBaru = inputAngka.nextInt();
                                System.out.print("New Name Menu : ");
                                namaBaru = inputString.nextLine();
                                System.out.print("New Price Menu : ");
                                hargaBaru = inputAngka.nextInt();
                                MinumDingin baru = new MinumDingin(kodeBaru,namaBaru,hargaBaru);
                                minumandingin.set(kode, baru);
                                System.out.println("After Updating ");
                                printmenu();
                                break;
                            }
                            case 0 -> {
                                System.out.println("Back to choose action");
                                System.out.println(" ");
                                break;
                            }
                            default -> {
                                System.out.println("Please choose your action correctly");
                                System.out.println(" ");
                                break;
                            }
                        }
                    }while(kategori!=0);
                    break;
                }
                case 0 ->  {
                    System.out.println("Back to main menu");
                    System.out.println(" ");
                    break;
                }
                default ->  {
                    System.out.println("Please choose your action correctly");
                    System.out.println(" ");
                    break;
                }
            }   
        }while(action != 0);
    }
}

public class Restoranadminuser {    
    static void management(){
        Login login_manager = new Login();
        Editmenu edit_menu = new Editmenu();
        System.out.println("Login required");
        System.out.print("Username : ");
        Scanner inpass = new Scanner(System.in);
        String username = inpass.nextLine();
        System.out.print("Password : ");
        String password = inpass.nextLine();
        if (username.equals(login_manager.getusername()) && password.equals(login_manager.getpassword())){
            System.out.println("Corrent username and password.");
            System.out.println(" ");
            edit_menu.edit();
        }
        else{
            System.out.println("Login failed. Wrong username or/and password.");
            System.out.println(" ");
        }
    }
    
    static void customer(){
        Editmenu data = new Editmenu();
        ArrayList<Pemesanan> pesan = new ArrayList<Pemesanan>();
        int pilihpesan;
        int total=0, subpembuka=0, subutama=0, subpenutup=0, subpanas=0, subdingin=0;
        do{
            System.out.println("Action : ");
            System.out.println("1. Order");
            System.out.println("2. Pay");
            System.out.print("Your choice : ");
            Scanner inpp = new Scanner(System.in);
            pilihpesan = inpp.nextInt();
            System.out.println(" ");
            switch(pilihpesan){
                case 1 ->  {
                    data.printmenu();
                    int katpesan;
                    do{
                        System.out.println("Category : ");
                        System.out.println("1. Appetizer");
                        System.out.println("2. Main Course");
                        System.out.println("3. Dessert");
                        System.out.println("4. Hot Baverage");
                        System.out.println("5. Cold Baverage");
                        System.out.println("0. Finish");
                        System.out.print("Your choice : ");
                        katpesan = inpp.nextInt();
                        switch(katpesan){
                            case 1 : {
                                data.printPembuka();
                                System.out.print("Menu number : ");
                                int index = inpp.nextInt();
                                System.out.print("Quantity : ");
                                int banyak = inpp.nextInt();
                                subpembuka =+ data.makananpembuka.get(index-1).hrPembuka * banyak;
                                pesan.add(new Pemesanan(data.makananpembuka.get(index-1).nmPembuka, banyak, data.makananpembuka.get(index-1).hrPembuka));
                                System.out.println(" ");
                                break;
                            }
                            case 2 : {
                                data.printUtama();
                                System.out.print("Menu number : ");
                                int index = inpp.nextInt();
                                System.out.print("Quantity : ");
                                int banyak = inpp.nextInt();
                                subutama =+ data.makananutama.get(index-1).hrUtama * banyak;
                                pesan.add(new Pemesanan(data.makananutama.get(index-1).nmUtama, banyak, data.makananutama.get(index-1).hrUtama));
                                System.out.println(" ");
                                break;
                            }
                            case 3 : {
                                data.printPenutup();
                                System.out.print("Menu number : ");
                                int index = inpp.nextInt();
                                System.out.print("Quantity : ");
                                int banyak = inpp.nextInt();
                                subpenutup =+ data.makananpenutup.get(index-1).hrPenutup * banyak;
                                pesan.add(new Pemesanan(data.makananpenutup.get(index-1).nmPenutup, banyak, data.makananpenutup.get(index-1).hrPenutup));
                                System.out.println(" ");
                                break;
                            }
                            case 4 : {
                                data.printPanas();
                                System.out.print("Menu number : ");
                                int index = inpp.nextInt();
                                System.out.print("Quantity : ");
                                int banyak = inpp.nextInt();
                                subpanas =+ data.minumanpanas.get(index-1).hrMinumPanas * banyak;
                                pesan.add(new Pemesanan(data.minumanpanas.get(index-1).nmMinumPanas, banyak, data.minumanpanas.get(index-1).hrMinumPanas));
                                System.out.println(" ");
                                break;
                            }
                            case 5 : {
                                data.printDingin();
                                System.out.print("Menu number : ");
                                int index = inpp.nextInt();
                                System.out.print("Quantity : ");
                                int banyak = inpp.nextInt();
                                subdingin =+ data.minumandingin.get(index-1).hrMinumDingin * banyak;
                                pesan.add(new Pemesanan(data.minumandingin.get(index-1).nmMinumDingin, banyak, data.minumandingin.get(index-1).hrMinumDingin));
                                System.out.println(" ");
                                break;
                            }
                            case 0 : {
                                System.out.println("Back to main menu");
                                System.out.println(" ");
                                break;
                            }
                            default : {
                                System.out.println("Please choose the category correctly");
                                System.out.println(" ");
                                break;
                            }
                        }
                    }while(katpesan!=0);
                    break;
                }
                case 2 ->  {
                    System.out.println("Your Order Summary");
                    int k=1;
                    for(Pemesanan all : pesan){
                        System.out.println(k + ". <" + all.nmPemesanan + ">-<" + all.jumPemesanan + ">-<" + all.hrPemesanan + ">-<" + all.jumPemesanan*all.hrPemesanan);
                        k++;
                    }
                    System.out.println(" ");
                    System.out.print("Total Payment : ");
                    total = subpembuka + subutama + subpenutup + subpanas + subdingin;
                     System.out.println(total);
                    System.out.println(" ");
                    System.out.println(" ");
                    break;
                }
                case 0 ->  {
                    System.out.println("Back to main menu");
                    System.out.println(" ");
                    break;
                }
                default ->  {
                    System.out.println("Please choose your action correctly");
                    System.out.println(" ");
                    break;
                }
            }
        }while(pilihpesan!=0);
    }
    
    public static void main(String[] args) {
        int role;
        do{
            System.out.println("Please choose your role : ");
            System.out.println("1. Restaurant Management");
            System.out.println("2. Customer");
            System.out.println("0. Exit");
            System.out.print("Your choice : ");
            Scanner inp = new Scanner(System.in);
            role = inp.nextInt();
            System.out.println(" ");
            switch(role){
                case 1 : {
                    management();
                    break;
                }
                case 2 : {
                    customer();
                    break;
                }
                case 0 : {
                    System.out.println("Thank you for coming");
                    System.out.println(" ");
                }
                default : {
                    System.out.println("Please choose your role correctly");
                    System.out.println(" ");
                }
            }
        }while(role != 0);
    }
}
