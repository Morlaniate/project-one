package org.example;

class SimpleTriple<L, M, R>  implements Triple<L, M, R> {

    private L left;
    private M middle;
    private R right;

    SimpleTriple(L left, M middle, R right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public M getMiddle() {
        return middle;
    }

    public R getRight() {
        return right;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    public void setMiddle(M middle) {
        this.middle = middle;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public SimpleTriple<R, M, L> reverse() {
        return new SimpleTriple<>(right, middle, left);
    }

    public boolean isEqualTo(SimpleTriple<L, M, R> triple) {
        return this.left.equals(triple.getLeft()) &&
                this.middle.equals(triple.getMiddle()) &&
                this.right.equals(triple.getRight());
    }

}
