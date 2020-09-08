<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<!-- make product unavailable if user external and product internal only -->
<c:if test="${product.internalOnly and !user.internal}">
    <c:set var="buttonType">button</c:set>
    <spring:theme code="text.addToCart.unavailable" var="addToCartText"/>
</c:if>
<div id="actions-container-for-${component.uid}" class="productAddToCartPanelContainer clearfix">
    <ul class="productAddToCartPanel clearfix">
        <action:actions element="li" styleClass="productAddToCartPanelItem span-5" parentComponent="${component}"/>
    </ul>
</div>