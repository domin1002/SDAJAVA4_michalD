import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> list = new ArrayList<>();
        String signal = Integer.toBinaryString(number);
        int[] tab = new int[5];
        int index = 4;

        for (int i = signal.length() - 1; i >= 0; i--) {
            if (index < 0) break;
            tab[index] = Integer.parseInt(signal.substring(i, i + 1));
            index--;
        }

        if (tab[4] == 1) list.add(Signal.WINK);
        if (tab[3] == 1) list.add(Signal.DOUBLE_BLINK);
        if (tab[2] == 1) list.add(Signal.CLOSE_YOUR_EYES);
        if (tab[1] == 1) list.add(Signal.JUMP);
        if (tab[0] == 1) Collections.reverse(list);

        return list;
    }

}
