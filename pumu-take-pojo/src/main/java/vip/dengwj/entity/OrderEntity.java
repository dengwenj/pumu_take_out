package vip.dengwj.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity implements Serializable {
    /**
     * 订单状态 1待付款 2待接单 3已接单 4派送中 5已完成 6已取消
     */
    public static final Integer PENDING_PAYMENT = 1;
    public static final Integer TO_BE_CONFIRMED = 2;
    public static final Integer CONFIRMED = 3;
    public static final Integer DELIVERY_IN_PROGRESS = 4;
    public static final Integer COMPLETED = 5;
    public static final Integer CANCELLED = 6;

    /**
     * 支付状态 0未支付 1已支付 2退款
     */
    public static final Integer UN_PAID = 0;
    public static final Integer PAID = 1;
    public static final Integer REFUND = 2;

    @ApiModelProperty("主键 id")
    private Long id;

    @ApiModelProperty("订单号")
    private String number;

    @ApiModelProperty("订单状态,1.待付款，2.待接单，3.已接单，4.派送中，5.已完成，6.已取消")
    private Integer status;

    @ApiModelProperty("用户 id")
    private Long userId;

    @ApiModelProperty("地址 id")
    private Long addressBookId;

    @ApiModelProperty("下单时间")
    private LocalDateTime orderTime;

    @ApiModelProperty("付款时间")
    private LocalDateTime checkoutTime;

    @ApiModelProperty("支付方式，1.微信支付，2.支付宝支付")
    private Integer payMethod;

    @ApiModelProperty("支付状态，0.未支付，1.已支付，2.退款")
    private Integer payStatus;

    @ApiModelProperty("订单金额")
    private BigDecimal amount;

    @ApiModelProperty("备注信息")
    private String remark;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("详细地址信息")
    private String address;

    @ApiModelProperty("收货人")
    private String consignee;

    @ApiModelProperty("订单取消原因")
    private String cancelReason;

    @ApiModelProperty("拒单原因")
    private String rejectionReason;

    @ApiModelProperty("订单取消时间")
    private LocalDateTime cancelTime;

    @ApiModelProperty("预计送达时间")
    private LocalDateTime estimatedDeliveryTime;

    @ApiModelProperty("配送状态,1.立即送出，0.选择具体时间")
    private Integer deliveryStatus;

    @ApiModelProperty("送达时间")
    private LocalDateTime deliveryTime;

    @ApiModelProperty("打包费")
    private Integer packAmount;

    @ApiModelProperty("餐具数量")
    private Integer tablewareNumber;

    @ApiModelProperty("餐具数量状态，1.按餐量提供，0.选择具体数量")
    private Integer tablewareStatus;
}
