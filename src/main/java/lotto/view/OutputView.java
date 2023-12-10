package lotto.view;

import lotto.model.Lotto;
import lotto.model.Lottos;

public class OutputView {

    public void printLottoPurchaseCount(int count){
        String message = count+"개를 구매했습니다.";
        printMessage("");
        printMessage(message);
    }

    public void printLottosNumbers(Lottos lottos){
        for (Lotto lotto : lottos.getLottos()) {
            printMessage(lotto.getNumbers().toString());
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }


    public void printErrorMessage(String error){
        System.out.println("[ERROR] "+error);
    }


}
