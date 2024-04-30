package Ali.Tala_taskslist.data.MyTasksTable;

import androidx.room.PrimaryKey;

public class MyTask {
    @PrimaryKey(autoGenerate = true)
    public long keyld;

    public int importance;

    public String shortTitle;

    public long time;

    public boolean isCompleted;

    public long subjld;

    public long userld;

    public long getKeyld() {
        return keyld;
    }

    public int getImportance() {
        return importance;
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public long getTime() {
        return time;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public long getSubjld() {
        return subjld;
    }

    public long getUserld() {
        return userld;
    }

    public void setKeyld(long keyld) {
        this.keyld = keyld;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public void setSubjld(long subjld) {
        this.subjld = subjld;
    }

    public void setUserld(long userld) {
        this.userld = userld;
    }
}
