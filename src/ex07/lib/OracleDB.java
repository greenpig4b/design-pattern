package ex07.lib;

public class OracleDB implements DB{

    private String url;

    // SQL 쿼리 전송 (1은 성공, -1은 실패)
    public int excute(String sql){

        if (url == null){
            System.out.println("path : null point error");
        }

        if (sql.equals("select")){
            System.out.println("query excute : " +url+"/"+sql);
            return 1;
        }else{
            System.out.println("query fail : syntax error" );
            return -1;
        }


    }

    // DBMS 서버 ip 세팅
    public void setUrl(String url){
        this.url = url;
    }
}
