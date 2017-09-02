package ir.mhp.twowayrecycler;

public interface OnMoreListener {
    /**
     * @param overallItemsCount
     * @param itemsBeforeMore
     * @param maxLastVisiblePosition for staggered grid this is max of all spans
     */
    void onMoreAsked(int overallItemsCount, int itemsBeforeMore, int maxLastVisiblePosition);

    /**
     * @param overallItemsCount
     * @param itemsBeforeMore
     * @param maxFirstVisiblePosition for staggered grid this is max of all spans
     */
    void onReachTop(int overallItemsCount, int itemsBeforeMore, int maxFirstVisiblePosition);
}
