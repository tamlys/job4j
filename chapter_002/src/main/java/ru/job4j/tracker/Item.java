package ru.job4j.tracker;
import java.util.Objects;
/**
 * Item
 * @author  Maxim Sachenkov (oqiwhite1996@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Item {
    private String id;
    private String name;
    private String desc;
    private long time;
    public Item(String name, String desc, long time) {
        this.name = name;
        this.desc = desc;
        this.time = time;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return this.desc;
    }
    public void setDecs(String desc) {
        this.desc = desc;
    }
    public long getTime() {
        return this.time;
    }
    public void setTime(long time) {
        this.time = time;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time && Objects.equals(id, item.id) && Objects.equals(name, item.name) && Objects.equals(desc, item.desc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, desc, time);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{ ");
        sb.append("id = '").append(id).append('\'');
        sb.append(", name = '").append(name).append('\'');
        sb.append(", desc = '").append(desc).append('\'');
        sb.append(", time = ").append(time);
        sb.append(" } ");
        return sb.toString();
    }

}
