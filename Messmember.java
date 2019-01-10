import java.util.ArrayList;
import java.util.Scanner;

public class Messmember {

    String memberName;
    int memberCost, mealCount;

    Messmember(String memberName) {
        this.memberName = memberName;
        this.memberCost = this.mealCount = 0;
    }

    public static void main(String[] args) {

        System.out.print("Enter number of mess member:");

        Scanner input = new Scanner(System.in);
        int memberCount = input.nextInt();

        ArrayList<Messmember> members = new ArrayList<Messmember>();

        for(int i=1; i<= memberCount; i++){
            System.out.print("Enter the name of member "+i+":");
            members.add(new Messmember(input.next()));
        }

        int totalMeal = 0,totalcost = 0;

        for (Messmember member: members) {

            System.out.print("Enter "+member.memberName+"'s number of meal:");
            totalMeal += member.mealCount = input.nextInt();
            System.out.print("Enter "+member.memberName+"'s cost:");
            totalcost += member.memberCost = input.nextInt();

        }

        double mealRate = (totalcost*1.0)/totalMeal;

        System.out.println("\nMeal Rate: "+mealRate);
        System.out.println();

        for (Messmember member : members) {
            double eat = mealRate*member.mealCount;
            if(eat>member.memberCost){
                System.out.println(member.memberName+" will give Tk = "+(eat-member.memberCost));
            }
            else{
                System.out.println(member.memberName+" will receive Tk = "+(member.memberCost-eat));
            }

        }



    }
}
