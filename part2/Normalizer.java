package part2.visitor;

public class Normalizer implements SegmentVisitor {
    public void visit(FormatSegment segment) {
        System.out.println("Normalizing FormatSegment");
    }
    public void visit(FactSegment segment) {
        System.out.println("Normalizing FactSegment");
    }
}
