package ch05_walking_and_rewriting_trees.p13_external_tree_visitor;

public class AddNode extends ExprNode {
    ExprNode left, right; // named, node-specific, irregular children
    public AddNode(ExprNode left, Token t, ExprNode right) {
        super(t);
        this.left = left;
        this.right = right;
    }

    @Override
    public void visit(VecMathVisitor visitor) {
        visitor.visit(this);
    }
}
