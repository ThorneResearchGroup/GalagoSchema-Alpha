package tech.tresearchgroup.schemas.galago.entities;

import io.activej.serializer.annotations.Deserialize;
import io.activej.serializer.annotations.Serialize;
import io.activej.serializer.annotations.SerializeNullable;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.tresearchgroup.palila.model.BasicObjectInterface;
import tech.tresearchgroup.schemas.galago.enums.QueueStateEnum;
import tech.tresearchgroup.schemas.galago.enums.QueueTypeEnum;

import java.util.Date;

@Data
@NoArgsConstructor
public class QueueEntity implements BasicObjectInterface {
    private transient Date created;

    private transient Date updated;

    private Long id;

    private QueueStateEnum status;

    private QueueTypeEnum action;

    private String payload;

    public QueueEntity(@Deserialize("created") Date created,
                       @Deserialize("updated") Date updated,
                       @Deserialize("id") Long id,
                       @Deserialize("status") QueueStateEnum status,
                       @Deserialize("action") QueueTypeEnum action,
                       @Deserialize("payload") String payload) {
        this.created = created;
        this.updated = updated;
        this.id = id;
        this.status = status;
        this.action = action;
        this.payload = payload;
    }

    @Serialize(order = 0)
    @SerializeNullable
    public Date getCreated() {
        return created;
    }

    @Serialize(order = 1)
    @SerializeNullable
    public Date getUpdated() {
        return updated;
    }

    @Serialize(order = 2)
    @SerializeNullable
    public Long getId() {
        return id;
    }

    @Serialize(order = 3)
    @SerializeNullable
    public QueueStateEnum getStatus() {
        return status;
    }

    @Serialize(order = 4)
    @SerializeNullable
    public QueueTypeEnum getAction() {
        return action;
    }

    @Serialize(order = 5)
    @SerializeNullable
    public String getPayload() {
        return payload;
    }
}
