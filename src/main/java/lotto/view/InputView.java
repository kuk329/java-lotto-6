package lotto.view;


import camp.nextstep.edu.missionutils.Console;
import java.awt.font.NumericShaper;

public class InputView {



    public int requestPurchaseMoney(){
        String message = "구입금액을 입력해 주세요.";
        printMessage(message);
        return getPurchaseMoney();
    }

    public int getPurchaseMoney(){
        String input = Console.readLine();
        validateInputEmpty(input);
        validateNumeric(input);
        return Integer.parseInt(input);
    }


    private void printMessage(String message){
        System.out.println(message);
    }


    private void validateInputEmpty(String input){
        if(input.isEmpty()){
            throw new IllegalArgumentException("값을 입력하지 않았습니다.");
        }
    }
    private void validateNumeric(String input){
        try{
            Integer.parseInt(input);
        }catch (NumberFormatException error){
            throw new NumberFormatException("숫자를 입력해 주세요.");
        }

    }
}
