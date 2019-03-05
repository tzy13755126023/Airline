# Airline

旅客有两种购票方式：（1）在网站上注册，成为系统用户。以注册用户身份进入，购买机票。该方式不享受团体折扣优惠。
                    （2）向旅行社提交购票信息，由旅行社统一从蓝天视窗公司机票销售系统购买机票。
                     该方式享受团体折扣优惠，折扣比例由蓝天视窗公司和旅行社协商。
                     两种方式都要求旅客提供机票购买信息，包括旅客的姓名、性别、手机号码、身份证号码、旅行/出差日期、旅行始发地和目的地，航班舱位
                     要求。旅行社在系统中也需要注册，注册信息包括：旅行社代号、办公地址、联系电话号码。
                    
旅客和旅行社在注册成功后，可以修改自身信息，但折扣比例不允许修改。

机票销售系统的购票流程如下：
                    1，旅客或者旅行社提交购票要求，系统扫描各个航班，匹配购票要求。如果要求得到满足，提示付款请求；
                       否则提示用户“购票不成功”，并输出不成功的原因。购票不成功的可能性包括：没有符合时间要求的航班，对应航班的票已经售完。
                    2，购票要求得到满足，提示付款要求后，用户可通过转账方式付款，系统确认后，输出机票信息。
                    旅客或者旅行社购票机票时，可通过多种方式查询航班信息。航班信息至少包括：航班号，航班名，飞机型号，航空公司，起飞时间，到达时间，
                    起飞城市，到达城市，飞行时间（礼拜一到礼拜日的选择），经济舱座位数，经济舱票价，公务/头等舱座位数，公务/头等舱票价，折扣比率
                    （只限于旅行社）

蓝天视窗公司为随时掌握各个航班飞机的乘载情况，需要定期进行查询统计，以便适当调整售票系统的航班。系统可以增加航班、删除航班；但是不允许修改航班信息
（座位数和折扣比率可以修改）。蓝天视窗公司能够统计某航班某次飞行的座位销售情况。蓝天视窗公司能够统计某旅客乘坐各航班的情况。蓝天视窗公司能够
统计某航空公司的上座率。
     
技术要求和限制条件
（1）飞行时间的选择，指礼拜一到礼拜日的选择。比如，有的航班只飞礼拜一；有的热门航班每天都飞行；也有的航班可能只飞礼拜二和礼拜六。
（2）航班信息、机票信息、旅客信息、旅行社信息、所有有效的购票记录都保存在数据库中。
（3）可考虑使用存储过程来执行统计功能。
（4）系统的外部输入项至少包括：旅客、旅行社、航空公司和蓝天视窗公司。
（5）系统只支持银行卡支付、支付宝支付和微信支付。采用模拟方式实现支付（只实现支付界面）。

3．系统扩充功能
（1）航空公司能够统计某航空公司某段时间的座位销售情况。
（2）航空公司能够统计某旅行社某时间段的购票情况。
（3）航空公司能够统计某航班某段时间的座位销售情况。
（4）航空公司能够统计某乘客某段时间的购票情况。
（5）对于本系统还可以补充以下功能：
          1．旅客退票的处理
          2．航班取消后的处理
          3．旅客临时更改航班的处理
  （6）航空公司可调整航班的部分信息，包括起飞时间，到达时间，飞行时间（礼拜一到礼拜日的选择）。
当时还没学框架
所以只是纯粹用MVC写的一个小实训，在混子老师带领下，所以别指望学到什么东西，都是靠自己。
简单的使用了JSP + servle + javabean的一种模式吧。

2019年3月5日下午五点