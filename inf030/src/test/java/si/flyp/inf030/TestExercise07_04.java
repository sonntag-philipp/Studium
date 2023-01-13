package si.flyp.inf030;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestExercise07_04 {
    
    @Test
    void Account_DagobertDuck_WithdrawalOutOfLimitsThrowsException() {
        Account account = new Account("Dagobert Duck", "KW77YZCQ2465324985213271278495");

        account.deposit(300000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(300001));
    }
    
    @Test
    void Account_DagobertDuck_CorrectNameIsSaved() {
        String name = "Dagobert Duck";

        Account account = new Account(name, "KW77YZCQ2465324985213271278495");

        assertEquals(name, account.getOwner());
    }
    
    @Test
    void Account_DonaldDuck_BalanceIsCorrect() {
        String name = "Dagobert Duck";

        Account account = new Account(name, "KW77YZCQ2465324985213271278495");

        account.deposit(300000);
        account.withdraw(100000);
        assertEquals(200000, account.getBalance());
    }
    
    @Test
    void Account_DonaldDuck_CorrectIbanIsSaved() {
        String iban = "KW77YZCQ2465324985213271278495";

        Account account = new Account("Dagobert Duck", iban);

        assertEquals(iban, account.getIban());
    }
}