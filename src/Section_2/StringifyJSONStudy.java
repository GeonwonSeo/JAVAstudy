package Section_2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

///JSON - JavaScript Object Notation 데이터 교환 목적
//
class StringifyJSONStudy {
    Map<String, String> message = new HashMap<>() {
        {
            put("sender", "김코딩");
            put("receiver", "박해커");
            put("message", "밥먹을래?");
            put("createdAt", "2021-01-12,10:10:10");
        }
    };

}
