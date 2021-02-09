
import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiRestClient;
import com.binance.api.client.domain.account.WithdrawHistory;

public class Test {
    
    public static void main (String[] args) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance("7hZJ1ue0v5Ro0FHp3VAixv0PxURAUIWI7c8nveFG2WF1Ht00exc3U7DIgu6XMx0n", "6z7s1ODDgdRcJQOyiPuCnl68FcE5oL0kU38lBmcoI8kvIWWYUt9P4lH6zBUzjX0t");
        BinanceApiRestClient client = factory.newRestClient();
    }
}
