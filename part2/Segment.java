package part2.visitor;

public abstract class Segment {
	public abstract void accept(SegmentVisitor visitor);
}
