DROP TABLE IF EXISTS tab1;
CREATE TABLE tab1 (
                                       id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                                       first VARCHAR(15),
                                       second VARCHAR(255),
                                       third INT,
                                       forth BOOLEAN
);


INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo11','bar11', 11, true );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo12','bar12', 12, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo13','bar13', 13, true );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo14','bar14', 14, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo15','bar15', 15, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo16','bar16', 16, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo17','bar17', 17, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo18','bar18', 18, false );
INSERT INTO tab1(first, second, third, forth) VALUES ( 'foo19','bar19', 19, false );
