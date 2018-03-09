package BehavioralPattern.ChainOfResponsibility;

public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request request) {
        System.out.println("Executing HTML Filter\n The request is " + request.getRequest());

        request.setRequest(
                request.getRequest().replace("<tag>", "Tag: ")
                                    .replace("</tag>", " ")
        );

        System.out.println("After HTML filtering, the request is " + request.getRequest());
    }
}
