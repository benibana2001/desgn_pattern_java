public interface Colleague {
    // Mediatorを割り当て
    public abstract void setMediator(Mediator mediator);
    // Mediatorからやってくる支持
    public abstract void setColleagueEnabled(boolean enabled);
}
