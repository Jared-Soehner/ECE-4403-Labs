package part2.visitor;

public class FormatSegment extends Segment {

    public void accept(SegmentVisitor visitor) {
        visitor.visit(this);
    }
}