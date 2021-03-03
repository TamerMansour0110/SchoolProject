package school.model;

import org.json.simple.JSONObject;

import java.io.IOException;

public interface InterFace<Inter> {
    JSONObject toJson() throws IOException;

    Inter fromJson(JSONObject jsonObject);

}
