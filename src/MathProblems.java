public class MathProblems {
    public void fractionValue(double value){
        double fractional_part = value % 1;
        double integral_part = value - fractional_part;
        System.out.println("\nOriginal value: "+value);
        System.out.println("\nIntegral part: "+integral_part);
        System.out.println("\nFractional part: "+fractional_part);
        System.out.println();
    }
}
