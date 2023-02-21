package com.learnbyheart.mysqldeadlock.summary;

public class Test {

    /**
     *
     * mysql死锁复现
     */

    //事务1
    /**
     * #第一步
     * BEGIN;
     * select * from test_deadlock where id =1 for update;
     * #COMMIT;
     *
     * #第三步 这步会锁 因为id为2的数据一直被另一个事物锁着 因为那个事务没提交
     * update test_deadlock set name='mu' where id = 2;
     *
     *
     */
    //事务2
    /**
     *  #第二步
     * BEGIN;
     * DELETE from  test_deadlock where id = 2;
     * # 锁释放就是把事务提交
     * #COMMIT; 最好别提交 提交事务就持久化到磁盘了  最好是回滚
     *
     * #第四步 这步也会锁因为id为1的被锁着了
     * delete from test_deadlock where id = 1;
     *
     */


    //上面的第一步和第二步分别把id为1和2的数据行都锁着了

    //后面第三步和第四步就没法修改 一直处于死循环的状态



}
