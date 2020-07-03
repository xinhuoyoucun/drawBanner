#绘制一个springboot的启动banner

###step1
    绘制一个图案保存到banner.txt文件中（png、gif也可以），文件放在resources下
    推荐一个帮助生产banner的网站：http://patorjk.com/software/taag/
     
###step2
    修改启动代码
    
    原代码：
    SpringApplication.run(BannerApplication.class, args);
    改为：    
    springApplication springApplication = new SpringApplication(BannerApplication.class);
    springApplication.setBannerMode(Banner.Mode.CONSOLE);
    springApplication.run(args);
    
###step3
    还可以通过修改参数改变 banner 的显示效果
    ${AnsiColor.xxxxxx}： 用来设定字符的前景色
    ${AnsiBackground.xxxxxx}： 用来设定字符的背景色
    ${AnsiStyle.xxxxxx}： 用来控制加粗、斜体、下划线等等。


###说明：
1.如果打印gif的话会把每一帧都打印下来,打印的顺序先图片然后文字，源码如下：
        banners.addIfNotNull(this.getImageBanner(environment));
        banners.addIfNotNull(this.getTextBanner(environment));
 
2.banner模式中有三种形式：
OFF：关闭banner
CONSOLE：打印到控制台
LOG：以日志的形式打印到控制台