INSERT INTO users (id, username, password) VALUES (1, 'admin', 'password1');
INSERT INTO users (id, username, password) VALUES (2, 'user', 'password2');

INSERT INTO roles (id, name) VALUES (4, 'ROLE_ADMIN');
INSERT INTO roles (id, name) VALUES (5, 'ROLE_USER');

INSERT INTO user_roles (user_id, role_id) VALUES (1, 4);
INSERT INTO user_roles (user_id, role_id) VALUES (2, 5);