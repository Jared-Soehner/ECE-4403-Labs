package part2.visitor;

public class Reverb implements SegmentVisitor {
    @Override
    public void visit(FormatSegment segment) {
        // Do reverb effect on the FormatSegment
        System.out.println("Adding reverb to FormatSegment");
    }

    @Override
    public void visit(FactSegment segment) {
        // Do reverb effect on the FactSegment
        System.out.println("Adding reverb to FactSegment");
    }
}
