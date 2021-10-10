package ModelFunctionsTests;

import com.example.model.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class GiftFunctionsTests {

    @Test
    public void addCandyToGift(){
        Gift gift = new Gift();
        Candy candy = new Candy();
        candy.setName("Spartak");
        gift.addToGift(candy);
        Assertions.assertEquals(candy,gift.getGift().get(0));
        Candy candy1 = new Candy();
        candy1.setName("Krokant");
        gift.addToGift(candy1);
        Assertions.assertEquals(candy1,gift.getGift().get(1));
    }

    @Test
    public void giftSugarContentTest(){
        Gift gift = new Gift();
        Candy candy1 = new Candy();
        Candy candy2 = new Candy();
        Candy candy3 = new Candy();
        Candy candy4 = new Candy();
        candy1.setSugar(50);
        candy2.setSugar(32);
        candy3.setSugar(18);
        candy4.setSugar(45);
        gift.addToGift(candy1);
        gift.addToGift(candy2);
        gift.addToGift(candy3);
        gift.addToGift(candy4);
        int sugar = candy1.getSugar()+candy2.getSugar()+candy3.getSugar()+candy4.getSugar();
        Assertions.assertEquals(sugar, gift.checkSugarContent());
    }

    @ParameterizedTest
    @MethodSource("compareParameters")
    public void candySearchingTest(Candy candy, Gift gift, Integer min, Integer max){
        Assertions.assertEquals(candy, gift.findCandiesBySugarContent(min,max).get(0));
    }

    public static Stream compareParameters(){
        Gift gift1 = new Gift();
        Gift gift2 = new Gift();
        Candy candy1 = new Candy();
        Candy candy2 = new Candy();
        Candy candy3 = new Candy();
        Candy candy4 = new Candy();
        candy1.setSugar(50);
        candy2.setSugar(32);
        candy3.setSugar(18);
        candy4.setSugar(45);
        gift1.addToGift(candy1);
        gift1.addToGift(candy2);
        gift2.addToGift(candy3);
        gift2.addToGift(candy4);

        return Stream.of(
                Arguments.of(candy2,gift1, 10,40),
                Arguments.of(candy3,gift2, 10,40)
        );
    }
}
