mybatis���򹤳�

mybatis���򹤳��Զ�����dao��entity�ͽӿ�ʹ�û������÷�ҳ

����jar����	    <artifactId>mybatis-generator-core</artifactId>
����ٷ������ļ�		generatorConfig.xml �޸��������� �����Լ����ݿ�
����ٷ�ִ���ļ�		GeneratorSqlmap.java �޸���ӳ�������ļ���·����Ȼ��main����ִ��
 �ظ�ִ�еĻ�����ᱻ���ǣ������ļ���׷�ӡ�
 
 �����Զ����ɵĽӿڵ��÷�
https://blog.csdn.net/feidao0/article/details/80731824

���򹤳�ֻ���ɵ����ѯ
����ϵ�����򹤳��޷��Զ����ɣ���Ҫ�ֶ�����
************************************************************************
rowbounds ���÷�ҳ
�Զ��巽��findByPage(RowBounds rb)
ʵ����RowBounds rb = new RowBounds(int offset, int limit ) 
ֱ�ӽ�rb����
List<Dept> list = mapper.findByPage(rb);
�Ϳ�ʵ�ַ�ҳ����
ԭ��
���������ݲ�ѯ�����󣬷����ڴ棬ͨ��rb.next()���п�������ָ����λ�ð������ó�
ȱ�� ��ռ����Դ�������ʹ��
