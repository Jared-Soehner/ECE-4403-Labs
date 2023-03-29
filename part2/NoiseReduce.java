package part2.visitor;

public class NoiseReduce implements SegmentVisitor {
    public void visit(FormatSegment segment) {
    }

    public void visit(FactSegment segment) {
        System.out.println("Reducing noise on FactSegment");
    }
}