package part2.visitor;

public class FactSegment extends Segment {
    public void accept(SegmentVisitor visitor) {
        visitor.visit(this);
    }
}
