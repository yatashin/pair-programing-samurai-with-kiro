import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.google.common.truth.Truth.assertThat;

public class HighCardTest {

    @Test
    public void testHighCard() {

        var hand = List.of(2,3,4,5,7);

        assertThat(getRank(hand)).isEqualTo("High Card");
    }

    @Test
    public void testOhePair() {
        var hand = List.of(2,2,3,4,5);

        assertThat(getRank(hand)).isEqualTo("One Pair");
    }

    @Test
    public void testTwoPair() {
        var hand = List.of(2,2,3,3,4);
        assertThat(getRank(hand)).isEqualTo("Two Pairs");
    }

    @Test
    public void testThreeCard() {
        var hand = List.of(2,2,2,3,4);
        assertThat(getRank(hand)).isEqualTo("Three Of a Kind");
    }

    @Test
    public void testStraight() {
        var hand = List.of(2,3,4,5,6);
        assertThat(getRank(hand)).isEqualTo("Straight");
    }

    private boolean isStraight(List<Integer> hand) {

        var lastCardRank = hand.get(0) - 1;
        for (var currentCardRank: hand) {
            if (currentCardRank != lastCardRank + 1) {
                return false;
            }

            lastCardRank = currentCardRank;
        }
        return true;
    }

    private String getRank(List<Integer> hand) {

        if (isStraight(hand)) {
            return "Straight";
        }

        var rankList = List.of(, "One Pair", "Two Pairs");

        var previousCardRank = 0;
        var pairCount = 0;
        var lastPaired = false;
        for (var currentCardRank: hand) {
            if (currentCardRank == previousCardRank) {
                if (lastPaired) {
                    return "Three Of a Kind";
                }
                pairCount += 1;
                lastPaired = true;
            }
            else {
                lastPaired = false;
            }

            previousCardRank = currentCardRank;
        }

        return rankList.get(pairCount);
    }
}
