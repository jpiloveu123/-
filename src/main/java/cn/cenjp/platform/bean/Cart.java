package cn.cenjp.platform.bean;import java.time.LocalDateTime;public class Cart {    private String userId;    private String goodName;    private String goodId;    private String spikeId;    private Double spikePrice;    private LocalDateTime startTime;    private LocalDateTime endTime;    public Cart() {    }    public String getUserId() {        return userId;    }    public void setUserId(String userId) {        this.userId = userId;    }    public String getGoodName() {        return goodName;    }    public void setGoodName(String goodName) {        this.goodName = goodName;    }    public String getSpikeId() {        return spikeId;    }    public void setSpikeId(String spikeId) {        this.spikeId = spikeId;    }    public double getSpikePrice() {        return spikePrice;    }    public void setSpikePrice(Double spikePrice) {        this.spikePrice = spikePrice;    }    public LocalDateTime getStartTime() {        return startTime;    }    public void setStartTime(LocalDateTime startTime) {        this.startTime = startTime;    }    public LocalDateTime getEndTime() {        return endTime;    }    public void setEndTime(LocalDateTime endTime) {        this.endTime = endTime;    }    public String getGoodId() {        return goodId;    }    public void setGoodId(String goodId) {        this.goodId = goodId;    }    @Override    public String toString() {        return "Cart{" +                "userId='" + userId + '\'' +                ", goodName='" + goodName + '\'' +                ", goodId='" + goodId + '\'' +                ", spikeId='" + spikeId + '\'' +                ", spikePrice=" + spikePrice +                ", startTime=" + startTime +                ", endTime=" + endTime +                '}';    }}