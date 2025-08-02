package gato_con_botas.dungeon;

public abstract class BaseRoom implements Room {
    protected String description;

    @Override
    public String getDescription() {
        return description;
    }
}