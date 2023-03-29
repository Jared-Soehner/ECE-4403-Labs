package part2.visitor;

public interface SegmentVisitor {
    void visit(FormatSegment segment);
    void visit(FactSegment segment);
}
