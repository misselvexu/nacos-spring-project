/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.nacos.spring.factory;

import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.listener.EventListener;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.alibaba.nacos.api.naming.pojo.ListView;
import com.alibaba.nacos.api.naming.pojo.ServiceInfo;
import com.alibaba.nacos.api.selector.AbstractSelector;
import com.alibaba.nacos.spring.metadata.NacosServiceMetaData;

import java.util.List;
import java.util.Properties;

/**
 * Delegating {@link NamingService} with {@link NacosServiceMetaData}
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy</a>
 * @see NamingService
 * @see NacosServiceMetaData
 * @since 0.1.0
 */
class DelegatingNamingService implements NamingService, NacosServiceMetaData {

    private final NamingService delegate;

    private final Properties properties;

    DelegatingNamingService(NamingService delegate, Properties properties) {
        this.delegate = delegate;
        this.properties = properties;
    }

    @Override
    public void registerInstance(String serviceName, String ip, int port) throws NacosException {
        delegate.registerInstance(serviceName, ip, port);
    }

    /**
     * register a instance to service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param ip          instance ip
     * @param port        instance port
     * @throws NacosException
     */
    @Override
    public void registerInstance(String serviceName, String groupName, String ip, int port) throws NacosException {
        delegate.registerInstance(serviceName, groupName, ip, port);
    }

    @Override
    public void registerInstance(String serviceName, String groupName, String ip, int port) throws NacosException {
        delegate.registerInstance(serviceName, groupName, ip, port);
    }

    @Override
    public void registerInstance(String serviceName, String ip, int port, String clusterName) throws NacosException {
        delegate.registerInstance(serviceName, ip, port, clusterName);
    }

    /**
     * register a instance to service with specified cluster name
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param ip          instance ip
     * @param port        instance port
     * @param clusterName instance cluster name
     * @throws NacosException
     */
    @Override
    public void registerInstance(String serviceName, String groupName, String ip, int port, String clusterName) throws NacosException {
        delegate.registerInstance(serviceName, groupName, ip, port, clusterName);
    }

    @Override
    public void registerInstance(String serviceName, String groupName, String ip, int port, String clusterName) throws NacosException {
        delegate.registerInstance(serviceName, groupName, ip, port, clusterName);
    }

    @Override
    public void registerInstance(String serviceName, Instance instance) throws NacosException {
        delegate.registerInstance(serviceName, instance);
    }

    /**
     * register a instance to service with specified instance properties
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param instance    instance to register
     * @throws NacosException
     */
    @Override
    public void registerInstance(String serviceName, String groupName, Instance instance) throws NacosException {
        delegate.registerInstance(serviceName, groupName, instance);
    }

    @Override
    public void registerInstance(String serviceName, String groupName, Instance instance) throws NacosException {
        delegate.registerInstance(serviceName, groupName, instance);
    }

    @Override
    public void deregisterInstance(String serviceName, String ip, int port) throws NacosException {
        delegate.deregisterInstance(serviceName, ip, port);
    }

    /**
     * deregister instance from a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param ip          instance ip
     * @param port        instance port
     * @throws NacosException
     */
    @Override
    public void deregisterInstance(String serviceName, String groupName, String ip, int port) throws NacosException {
        delegate.registerInstance(serviceName, groupName, ip, port);
    }

    @Override
    public void deregisterInstance(String serviceName, String groupName, String ip, int port) throws NacosException {
        delegate.deregisterInstance(serviceName, groupName, ip, port);
    }

    @Override
    public void deregisterInstance(String serviceName, String ip, int port, String clusterName) throws NacosException {
        delegate.deregisterInstance(serviceName, ip, port, clusterName);
    }

    /**
     * deregister instance with specified cluster name from a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param ip          instance ip
     * @param port        instance port
     * @param clusterName instance cluster name
     * @throws NacosException
     */
    @Override
    public void deregisterInstance(String serviceName, String groupName, String ip, int port, String clusterName) throws NacosException {
        delegate.deregisterInstance(serviceName, groupName, ip, port, clusterName);
    }

    /**
     * deregister instance with full instance information
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param instance    instance information
     * @throws NacosException
     */
    @Override
    public void deregisterInstance(String serviceName, String groupName, Instance instance) throws NacosException {
        delegate.deregisterInstance(serviceName, groupName, instance);
    }

    @Override
    public void deregisterInstance(String serviceName, String groupName, String ip, int port, String clusterName) throws NacosException {
        delegate.deregisterInstance(serviceName, groupName, ip, port, clusterName);
    }

    @Override
    public void deregisterInstance(String serviceName, String groupName, Instance instance) throws NacosException {
        delegate.deregisterInstance(serviceName, groupName, instance);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName) throws NacosException {
        return delegate.getAllInstances(serviceName);
    }

    /**
     * get all instances of a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @return A list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName);
    }

    /**
     * Get all instances of a service
     *
     * @param serviceName name of service
     * @param subscribe   if subscribe the service
     * @return A list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, subscribe);
    }

    /**
     * Get all instances of a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param subscribe   if subscribe the service
     * @return A list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, subscribe);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, subscribe);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, subscribe);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, List<String> clusters) throws NacosException {
        return delegate.getAllInstances(serviceName, clusters);
    }

    /**
     * Get all instances within specified clusters of a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @return A list of qualified instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, List<String> clusters) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, clusters);
    }

    /**
     * Get all instances within specified clusters of a service
     *
     * @param serviceName name of service
     * @param clusters    list of cluster
     * @param subscribe   if subscribe the service
     * @return A list of qualified instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, clusters, subscribe);
    }

    /**
     * Get all instances within specified clusters of a service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @param subscribe   if subscribe the service
     * @return A list of qualified instance
     * @throws NacosException
     */
    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, clusters, subscribe);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, List<String> clusters) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, clusters);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, clusters, subscribe);
    }

    @Override
    public List<Instance> getAllInstances(String serviceName, String groupName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.getAllInstances(serviceName, groupName, clusters, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, healthy);
    }

    /**
     * Get qualified instances of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, healthy);
    }

    /**
     * Get qualified instances of service
     *
     * @param serviceName name of service
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @param subscribe   if subscribe the service
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, healthy, subscribe);
    }

    /**
     * Get qualified instances of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @param subscribe   if subscribe the service
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, healthy, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, healthy);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, healthy, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, healthy, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, List<String> clusters, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, clusters, healthy);
    }

    /**
     * Get qualified instances within specified clusters of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, List<String> clusters, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, clusters, healthy);
    }

    /**
     * Get qualified instances within specified clusters of service
     *
     * @param serviceName name of service
     * @param clusters    list of cluster
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @param subscribe   if subscribe the service
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, List<String> clusters, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, clusters, healthy, subscribe);
    }

    /**
     * Get qualified instances within specified clusters of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @param healthy     a flag to indicate returning healthy or unhealthy instances
     * @param subscribe   if subscribe the service
     * @return A qualified list of instance
     * @throws NacosException
     */
    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, List<String> clusters, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, clusters, healthy, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, List<String> clusters, boolean healthy) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, clusters, healthy);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, List<String> clusters, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, clusters, healthy, subscribe);
    }

    @Override
    public List<Instance> selectInstances(String serviceName, String groupName, List<String> clusters, boolean healthy, boolean subscribe) throws NacosException {
        return delegate.selectInstances(serviceName, groupName, clusters, healthy, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName);
    }

    /**
     * Select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName);
    }

    /**
     * select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param subscribe   if subscribe the service
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, subscribe);
    }

    /**
     * select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param subscribe   if subscribe the service
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, List<String> clusters) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, clusters);
    }

    /**
     * Select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    a list of clusters should the instance belongs to
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, List<String> clusters) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, clusters);
    }

    /**
     * Select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param clusters    a list of clusters should the instance belongs to
     * @param subscribe   if subscribe the service
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, clusters, subscribe);
    }

    /**
     * Select one healthy instance of service using predefined load balance strategy
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    a list of clusters should the instance belongs to
     * @param subscribe   if subscribe the service
     * @return qualified instance
     * @throws NacosException
     */
    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, clusters, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, List<String> clusters) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, clusters);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, clusters, subscribe);
    }

    @Override
    public Instance selectOneHealthyInstance(String serviceName, String groupName, List<String> clusters, boolean subscribe) throws NacosException {
        return delegate.selectOneHealthyInstance(serviceName, groupName, clusters, subscribe);
    }

    @Override
    public void subscribe(String serviceName, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, listener);
    }

    /**
     * Subscribe service to receive events of instances alteration
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param listener    event listener
     * @throws NacosException
     */
    @Override
    public void subscribe(String serviceName, String groupName, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, groupName, listener);
    }

    @Override
    public void subscribe(String serviceName, String groupName, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, groupName, listener);
    }

    @Override
    public void subscribe(String serviceName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, clusters, listener);
    }

    /**
     * Subscribe service to receive events of instances alteration
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @param listener    event listener
     * @throws NacosException
     */
    @Override
    public void subscribe(String serviceName, String groupName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, groupName, clusters, listener);
    }

    @Override
    public void subscribe(String serviceName, String groupName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.subscribe(serviceName, groupName, clusters, listener);
    }

    @Override
    public void unsubscribe(String serviceName, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, listener);
    }

    /**
     * unsubscribe event listener of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param listener    event listener
     * @throws NacosException
     */
    @Override
    public void unsubscribe(String serviceName, String groupName, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, groupName, listener);
    }

    @Override
    public void unsubscribe(String serviceName, String groupName, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, groupName, listener);
    }

    @Override
    public void unsubscribe(String serviceName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, clusters, listener);
    }

    /**
     * Unsubscribe event listener of service
     *
     * @param serviceName name of service
     * @param groupName   group of service
     * @param clusters    list of cluster
     * @param listener    event listener
     * @throws NacosException
     */
    @Override
    public void unsubscribe(String serviceName, String groupName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, groupName, clusters, listener);
    }

    @Override
    public void unsubscribe(String serviceName, String groupName, List<String> clusters, EventListener listener) throws NacosException {
        delegate.unsubscribe(serviceName, groupName, clusters, listener);
    }

    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize);
    }

    /**
     * Get all service names from server
     *
     * @param pageNo    page index
     * @param pageSize  page size
     * @param groupName group name
     * @return list of service names
     * @throws NacosException
     */
    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, String groupName) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, groupName);
    }

    /**
     * Get all service names from server with selector
     *
     * @param pageNo   page index
     * @param pageSize page size
     * @param selector selector to filter the resource
     * @return list of service names
     * @throws NacosException
     * @since 0.7.0
     */
    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, AbstractSelector selector) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, selector);
    }

    /**
     * Get all service names from server with selector
     *
     * @param pageNo    page index
     * @param pageSize  page size
     * @param groupName group name
     * @param selector  selector to filter the resource
     * @return list of service names
     * @throws NacosException
     */
    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, String groupName, AbstractSelector selector) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, groupName, selector);
    }

    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, String groupName) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, groupName);
    }

    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, AbstractSelector selector) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, selector);
    }

    @Override
    public ListView<String> getServicesOfServer(int pageNo, int pageSize, String groupName, AbstractSelector selector) throws NacosException {
        return delegate.getServicesOfServer(pageNo, pageSize, groupName, selector);
    }

    @Override
    public List<ServiceInfo> getSubscribeServices() throws NacosException {
        return delegate.getSubscribeServices();
    }

    @Override
    public String getServerStatus() {
        return delegate.getServerStatus();
    }

    @Override
    public Properties getProperties() {
        return properties;
    }
}
