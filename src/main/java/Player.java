public class Player {
    private String name;
    private String email;
    private boolean white;
    private int rank;
    private int age;




    public Player(String name, String email, boolean white, int rank, int age){
        if(name.isEmpty()||name.isBlank()||name ==null) {
            throw new IllegalArgumentException("The name should not be empty");
        } else {
            this.name = name;
        }
        if(name.isEmpty()||name.isBlank()||name ==null) {
            System.out.println("Не корректный ввод");
        } else {
            this.name = name;
        }
        if (email.contains("@") == (false || email.contains(".") == false)){
            throw new IllegalArgumentException("The email should contain '@' and '.'");
        }
        else {
            this.name = name;
        }
        this.email = email;
        this.white = white;
        this.rank = rank;
        this. age = age;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isWhite() {
        return white;
    }

    public int getRank() {
        return rank;
    }

    public int getAge() {
        return age;
    }
    ////////////////////////////////////////////////////////Сетеры
    public void setName(String name) {

    }

    public void setEmail(String email) {

            this.email = email;
        }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public void setRank(int rank) {
        if(rank<100||rank>3000){
            throw new IllegalArgumentException(" The rank should be in range of 100 and 3000");
        }
        this.rank = rank;
        System.out.println("The rank of"+name+"was change to"+rank);
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException(" The age < 0");
        }

        this.age = age;
    }
    public void movePiece(Piece piece, Spot spot){
        if (isWhite() !=piece.isWhite()){
            throw new IllegalArgumentException("Incorrect piese color. Try again");
        }
        piece.setSpot(spot);
        System.out.println("Piece"+piece.getName()+"is moved"+spot);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", white=" + white +
                ", rank=" + rank +
                ", age=" + age +
                '}';
    }
}
