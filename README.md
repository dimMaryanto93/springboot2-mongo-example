# Springboot Mongo Webapp

### Set replication mode

```bash
/usr/bin/mongod --bind_ip_all --replSet rs0
```

### Enabled transactional in mongodb

```bash
mongo -u master_user -p master_password --eval "rs.initiate()"
```
