public interface Mediator {
    // Colleague Class を作成
    public abstract void createColleague();
    // Colleague たちから呼び出される
    public abstract void colleagueChanged();
}
