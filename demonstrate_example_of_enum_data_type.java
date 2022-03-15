public class demonstrate_example_of_enum_data_type {
     // enum type must be global
    enum weekDays {
        SUN,
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT
    }
    public static void main(String args[]) {

        //print all values
        System.out.println("Value of SUN: " + weekDays.SUN);
        System.out.println("Value of MON: " + weekDays.MON);
        System.out.println("Value of TUE: " + weekDays.TUE);
        System.out.println("Value of WED: " + weekDays.WED);
        System.out.println("Value of THU: " + weekDays.THU);
        System.out.println("Value of FRI: " + weekDays.FRI);
        System.out.println("Value of SAT: " + weekDays.SAT);
    }

}
