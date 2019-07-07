mybatis逆向工程

mybatis逆向工程自动生成dao和entity和接口使用还有内置分页

导入jar包，	    <artifactId>mybatis-generator-core</artifactId>
导入官方配置文件		generatorConfig.xml 修改其中属性 符合自己数据库
导入官方执行文件		GeneratorSqlmap.java 修改下映射配置文件的路径，然后main方法执行
 重复执行的话，类会被覆盖，配置文件会追加。
 
 关于自动生成的接口的用法
https://blog.csdn.net/feidao0/article/details/80731824

逆向工程只生成单表查询
多表关系，逆向工程无法自动生成，需要手动配置
************************************************************************
rowbounds 内置分页
自定义方法findByPage(RowBounds rb)
实例化RowBounds rb = new RowBounds(int offset, int limit ) 
直接将rb放入
List<Dept> list = mapper.findByPage(rb);
就可实现分页功能
原理：
将所有数据查询出来后，放入内存，通过rb.next()进行空跳，到指定的位置把数据拿出
缺点 ，占用资源，看情况使用
