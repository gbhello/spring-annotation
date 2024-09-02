package com.box.tx;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 描述111
 *
 * @author gengbin29080
 * @date 2022/1/13
 */
@Configuration
@EnableTransactionManagement
@ComponentScan("com.box.tx")
public class TxConfig {
//    @Bean
//    public DataSource dataSource() throws PropertyVetoException {
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("123456");
//        dataSource.setDriverClass("com.mysql.jdbc.Driver");
//        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/letao");
//        return dataSource;
//    }

//    @Bean
//    public JdbcTemplate jdbcTemplate() throws PropertyVetoException {
//        return new JdbcTemplate(dataSource());
//    }
//    @Bean
//    public PlatformTransactionManager transactionManager() throws PropertyVetoException {
//        return new DataSourceTransactionManager(dataSource());
//    }
}
