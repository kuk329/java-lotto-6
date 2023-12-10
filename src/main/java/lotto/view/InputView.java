package lotto.view;


import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

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

    public List<Integer> requestWinningNumbers(){
        String message = "당첨 번호를 입력해 주세요.";
        printMessage("");
        printMessage(message);
        return getWinningNumbers();
    }

    public List<Integer> getWinningNumbers(){
        String input = Console.readLine();
        validateInputEmpty(input);
        return validateInputFormat(input);

    }

    public List<Integer> changeStringToArray(String[] split){
        ArrayList<Integer> list  = new ArrayList<>();
        for (String str : split) {
            list.add(Integer.parseInt(str));
        }
        return list;

    }

    public Integer requestBonusNumber(){
        String message = "보너스 번호를 입력해 주세요.";
        printMessage(message);
        return getBonusNumber();
    }

    private Integer getBonusNumber() {
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

    private List<Integer> validateInputFormat(String input){
        try{
            String[] split = input.split(",");
            return changeStringToArray(split);
        }catch (IllegalArgumentException e){
            throw new NumberFormatException(",구분자를 사용해 당첨 번호를 입력해 주세요.");

        }
    }

}
