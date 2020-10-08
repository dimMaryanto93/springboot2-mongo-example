# Springboot Mongo Webapp

### Set replication mode

```bash
/usr/bin/mongod --bind_ip_all --replSet rs0
```

### Enabled transactional in mongodb

```bash
mongo -u your-username -p your-password --eval "rs.initiate()"
```
