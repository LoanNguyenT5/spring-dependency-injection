package pojobeans;

public class AccountServiceImpl implements AccountService{
    // AccountRepository is a dependency of AccountServiceImpl
    private AccountRepository accountRepository;

    // Dependency injection via Setter method
    public void setAccountRepository(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    /**
     * @param fromAccountId
     * @param toAccountId
     * @param amount
     */
    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account sourceAccount = accountRepository.find(fromAccountId);
        Account targetAccout = accountRepository.find(toAccountId);
        sourceAccount.setBalance(sourceAccount.getBalance() - amount);
        targetAccout.setBalance(targetAccout.getBalance() + amount);

        accountRepository.update(sourceAccount);
        accountRepository.update(targetAccout);
    }

    /**
     * @param accountId
     * @param amount
     * @throws Exception
     */
    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance() - amount);
        accountRepository.update(account);
    }

    /**
     * @param accountId
     * @return
     */
    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}
