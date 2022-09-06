public class grade {
    public static void main(String[] args) {

        double grade = Math.floor(Math.random() * 101);
        System.out.println(grade);

        if (grade >= 90){
            System.out.println("You got an A!");
        }else if (grade >= 80){
            System.out.println("You got a B");
        }else if (grade >= 70){
            System.out.println("You got a C");
        }else if (grade >= 60){
            System.out.println("You got a D");
        }else if (grade >= 50){
            System.out.println("You got a F");
        }else{
            System.out.println("You failed miserably");
        }

    }
}
