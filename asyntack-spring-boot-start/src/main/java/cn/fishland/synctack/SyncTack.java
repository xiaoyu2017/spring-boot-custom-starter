package cn.fishland.synctack;

/**
 * TODO
 *
 * @author xiaoyu
 * @version 1.0
 */
public class SyncTack {

    private String name;
    private Integer status;

    public SyncTack() {
    }

    public SyncTack(String name, Integer status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
